pipeline {
    agent any

    environment {
        DOCKER_REGISTRY_CREDENTIALS = 'DockerHubCred'
        DOCKER_IMAGE_NAME = '23subbhashit/minispe'
    }

    stages {
        stage('Clone Repository') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']], // Specify the branch to checkout
                    doGenerateSubmoduleConfigurations: false,
                    extensions: [], // Any additional GitSCMExtension you might need
                    submoduleCfg: [], // Submodule configurations if applicable
                    userRemoteConfigs: [[url: 'https://github.com/23subbhashit/MiniSPE.git']] // Specify the repository URL
                ])
            }
        }

        stage('Build') {
            steps {
                dir('/mnt/c/Users/User/Desktop/minispe') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                dir('/mnt/c/Users/User/Desktop/minispe') {
                    script {
                        docker.build("${DOCKER_IMAGE_NAME}", '.')
                    }
                }
            }
        }

        stage('Push Docker Images') {
            steps {
                script {
                    docker.withRegistry('', 'DockerHubCred') {
                        sh "docker tag ${DOCKER_IMAGE_NAME}:latest ${DOCKER_IMAGE_NAME}:latest"
                        sh "docker push ${DOCKER_IMAGE_NAME}:latest"
                    }
                }
            }
        }

        stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                    )
                }
            }
        }
    }
}
