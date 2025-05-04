
# To-Do List Full Stack App

A simple full-stack To-Do List application built with **Spring Boot** (Backend) and **React.js** (Frontend). This application allows users to add, update, delete, and view tasks in a to-do list.

## Features

- **Add Tasks**: Users can add new tasks to their to-do list.
- **Edit Tasks**: Users can modify existing tasks.
- **Delete Tasks**: Users can remove tasks from the list.
- **View Tasks**: Users can see a list of all tasks.
- **Responsive UI**: Built with React.js and styled using Tailwind CSS to ensure a good user experience across different screen sizes.

## Tech Stack

- **Frontend**: React.js, Tailwind CSS
- **Backend**: Spring Boot (Java)
- **Database**: H2 Database (In-Memory)
- **Build Tool**: Maven

## Getting Started

To run this application locally, follow these steps:

### Prerequisites

1. **Java 21+** installed on your machine.
2. **Node.js** and **npm** installed.
3. **Maven** installed for building the backend.

### Running the Backend (Spring Boot)

1. Clone the repository:
   ```bash
   git clone https://github.com/Srinath22082005/to-do-list_FullStackApp.git
   cd to-do-list_FullStackApp
   ```

2. Navigate to the backend folder and build the project using Maven:
   ```bash
   cd backend
   mvn clean install
   ```

3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

   The backend will be running at `http://localhost:8080`.

### Running the Frontend (React.js)

1. Navigate to the frontend folder:
   ```bash
   cd frontend
   ```

2. Install the required dependencies:
   ```bash
   npm install
   ```

3. Start the React development server:
   ```bash
   npm start
   ```

   The frontend will be running at `http://localhost:3000`.

### Connecting Frontend and Backend

By default, the React frontend is set up to communicate with the backend running on `http://localhost:8080`. Ensure both the backend and frontend are running for the application to work properly.

## Project Structure

```
.
├── backend/
│   ├── src/
│   ├── pom.xml
│   └── ...
└── frontend/
    ├── src/
    ├── package.json
    └── ...
```

## Contributing

Feel free to fork this repository and submit pull requests if you want to contribute.

### Steps for Contribution:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-name`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature-name`).
6. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- **Spring Boot**: Powerful and easy-to-use framework for building Java-based web applications.
- **React.js**: A popular JavaScript library for building user interfaces.
- **Tailwind CSS**: A utility-first CSS framework for rapid UI development.
