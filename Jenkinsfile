pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']], // Specify the branch to checkout
                    doGenerateSubmoduleConfigurations: false,
                    extensions: [], // Any additional GitSCMExtension you might need
                    submoduleCfg: [], // Submodule configurations if applicable
                    userRemoteConfigs: [[url: 'https://github.com/23subbhashit/calc.git']] // Specify the repository URL
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
                script {
                    docker.build('calc-image:latest', '.')
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('https://docker.io', 'docker-hub-credentials') {
                        dockerImage = docker.image('calc-image:latest')
                        dockerImage.push()
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
