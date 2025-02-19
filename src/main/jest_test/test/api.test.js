const request = require('supertest');

const baseURL = 'http://localhost:8080'; // Your Spring Boot backend URL

describe('AppUser API Tests', () => {
    test('should create a new user', async () => {
        const newUser = {
            name: 'testUser',  // Correct property name
            email: 'testuser@example.com'
        };

        const response = await request(baseURL)
            .post('/appUsers')
            .send(newUser)
            .set('Content-Type', 'application/json');

        console.log(response.body);  // Debugging the response

        // Check if the response status is 201 Created
        expect(response.status).toBe(201);

        // Validate the response body
        expect(response.body).toHaveProperty('id'); // Ensure 'id' is present
        expect(response.body.name).toBe(newUser.name); // Ensure 'name' matches
    });
});
