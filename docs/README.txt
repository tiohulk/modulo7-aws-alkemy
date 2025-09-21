# Proyecto Base: Microservicios Orquestados en AWS

Este proyecto contiene tres microservicios básicos:

- Usuarios
- Pagos
- Notificaciones

Cada uno está desarrollado en Java, con pruebas unitarias usando JUnit 5. Los servicios están preparados para ser empaquetados en contenedores Docker y desplegados en Amazon EKS usando archivos YAML.

## Estructura del Proyecto

- `usuarios/`: Servicio de gestión de usuarios
- `pagos/`: Servicio de procesamiento de pagos
- `notificaciones/`: Servicio de envío de notificaciones
- `docker/`: Dockerfiles para cada microservicio
- `k8s/`: Archivos YAML para despliegue en Kubernetes
- `docs/`: Documentación del proyecto

## Requisitos

- Java 17
- Docker
- AWS CLI + eksctl
- Kubernetes (kubectl)
- AWS Account con acceso a ECR y EKS

## Pasos Iniciales

1. Compilar los microservicios
2. Crear imágenes Docker y subirlas a Amazon ECR
3. Crear clúster EKS con `eksctl`
4. Aplicar los archivos YAML con `kubectl apply -f`
5. Configurar Ingress para acceso externo

## Próximos pasos

- Añadir autenticación JWT
- Integrar API Gateway
- Implementar Service Discovery con AWS Cloud Map
- Añadir Circuit Breaker con Resilience4j
- Configurar SNS/SQS para mensajería asíncrona
