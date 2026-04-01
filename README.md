# Vibha
# Vibha Finance Pvt Ltd - Banking Application (Enterprise Project)

## 🏦 Overview

Vibha Finance is a **microservices-based banking application** inspired
by real-world financial systems.

------------------------------------------------------------------------

## 🧠 Architecture

Users → CDN → WAF → Load Balancer → API Gateway → Microservices
(Kubernetes) → PostgreSQL / Redis / Kafka → Monitoring (Prometheus +
Grafana)

------------------------------------------------------------------------

## 🔐 Security

-   JWT Authentication
-   HTTPS (TLS)
-   Encryption (AES-256)
-   RBAC
-   Secrets Manager

------------------------------------------------------------------------

## 🧱 Tech Stack

-   Backend: Spring Boot
-   Frontend: React
-   DevOps: Docker, Kubernetes
-   CI/CD: GitHub Actions
-   Monitoring: Prometheus, Grafana

------------------------------------------------------------------------

## 📁 Folder Structure

backend/ (auth, user, payment) frontend/ infra/kubernetes/ ci-cd/
monitoring/ docs/

------------------------------------------------------------------------

## 🚀 Setup Steps

### 1. Clone Repo

git clone `<repo>`{=html} cd Vibha-Finance

### 2. Build Backend

cd backend/auth-service mvn clean package

### 3. Run Services

java -jar target/\*.jar

------------------------------------------------------------------------

## 🐳 Docker

docker build -t vibha/auth-service . docker run -p 8081:8081
vibha/auth-service

------------------------------------------------------------------------

## ☸️ Kubernetes

kubectl apply -f infra/kubernetes/deployments/ kubectl apply -f
infra/kubernetes/services/

------------------------------------------------------------------------

## 🔥 API Testing

POST /auth/login GET /users/{id} POST /payments/transfer

------------------------------------------------------------------------

## 📊 Monitoring

kubectl apply -f monitoring/prometheus/ kubectl apply -f
monitoring/grafana/

------------------------------------------------------------------------

## 🔄 CI/CD

Git Push → GitHub Actions → Build → Deploy

------------------------------------------------------------------------

## 🎯 Future Enhancements

-   PostgreSQL + JPA
-   Kafka integration
-   API Gateway
-   Redis cache
-   Advanced Security

------------------------------------------------------------------------

## 🧠 Interview Explanation

"We designed Vibha Finance as a secure microservices banking system
using Spring Boot, Kubernetes, JWT authentication, and CI/CD pipelines
with full monitoring."
