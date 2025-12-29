# JWT Authentication – Minimal Spring Boot Example

This project demonstrates a minimal and correct implementation of JWT-based authentication using Spring Boot and Spring Security. It is intentionally simple and designed to show the core concepts of stateless authentication without introducing databases, user models, roles, or additional complexity.

The application exposes a public `/login` endpoint that issues a JSON Web Token (JWT) and protects all other endpoints by default. Authentication is enforced globally using Spring Security’s filter chain, meaning requests are validated **before** they reach any controller. Controllers themselves contain no authentication logic.

This project is intended as a learning project. It shows how JWTs are generated, validated, and applied as a global “wrapper” around APIs. More advanced features such as real user authentication, roles, refresh tokens, and database integration can be added incrementally on top of this structure.
