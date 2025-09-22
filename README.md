# Consensus Network Simulator (CNSim) - Test Environment

This is a test environment for the CNSim Bitcoin simulator, used for development and testing purposes.

## Documentation

The project automatically generates and deploys Javadoc documentation to GitHub Pages.

- **Live Documentation**: Available at `https://[username].github.io/[repository-name]/`
- **Local Generation**: Run `mvn javadoc:javadoc` to generate docs locally

## Features

- Automatic Javadoc generation and deployment via GitHub Actions
- Bitcoin network consensus simulation
- Java 21 compatible
- Maven-based build system

## Usage

```bash
# Run simulation
./run

# Generate documentation locally
mvn clean javadoc:javadoc

# View local docs
open target/site/index.html
```

## GitHub Pages Setup

The repository includes a GitHub Actions workflow (`.github/workflows/deploy-javadoc.yml`) that:

1. Automatically generates Javadoc when you push to the `main` branch
2. Deploys the documentation to GitHub Pages
3. Makes the docs available at your GitHub Pages URL

To enable GitHub Pages:
1. Go to your repository settings
2. Navigate to "Pages" section
3. Select "GitHub Actions" as the source
4. The workflow will automatically deploy on the next push
