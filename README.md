# Currency calculator

This is some simple application which server for user some service that allow calculate some currencies.

## Application is build from two parts:  
- Backend - is build in spring technology
- Frontend - is build in angular 2 technology with nodejs as server to serve code

## Install
```bash
$: cd backend
$: mvn clean package
$: java -Dserver.port=8091 -jar target/gs-rest-service-0.1.0.jar
```

```bash
$: cd frontend
$: npm install
$: npm start
```

If you want some special configuration (different port or host) u should change url to backend in:
app/shared/currency.service.ts
