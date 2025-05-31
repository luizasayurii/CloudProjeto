## CloudProjeto

## Funcionalidades principais:
- Cadastro de problemas urbanos com título, descrição, categoria e localização;
- Painel administrativo com controle e atualização do status dos problemas;
- Envio e visualização de comentários para facilitar a comunicação entre usuário e gestor;
- Registro de logs para manter um histórico de alterações e ações;
- Dashboard estatístico gerado por uma função AWS Lambda, com dados agregados por categoria.
A aplicação está estruturada em um ambiente de nuvem escalável na AWS, com integração entre EC2, RDS, Lambda e API Gateway — garantindo performance, segurança e alta disponibilidade.

## Membros do projeto 
- 10416872 - Luiza Sayuri Kawakami 
- 10416957 - Luiza Liao
- 10418366 - Giovanna Costa 
- 10418688 - Matheus Caleiro


## Tecnologias
- Backend: Java, Spring Boot 
- Frontend: React
- Docker 
- RDS - MySql 
- Node.js (Lambda Runtime) 
- AWS Lambda 
- API Gateway (HTTP API) 


## EC2
- Sistema - linux - ubuntu 24.04
- Java 17
- Docker 26.1.3
- Container único com backend + frontend embarcado


## Rotas Disponíveis
- http://52.71.87.155/usuarios
- http://52.71.87.155/problemas


## Endpoint RDS privado
- database-1.cwoptrg0init.us-east-1.rds.amazonaws.com
- Acesso restrito a partir da VPC (sub-rede privada)
- Alta disponibilidade com múltiplas zonas de disponibilidade


## Lambda
Lambda coleta dados de /problemas


## Endpoint API Gateway
https://l23j6en3gd.execute-api.us-east-1.amazonaws.com/prod/Func-proj



