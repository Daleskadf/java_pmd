## How to Run the Application

1. Make sure Java is installed and configured in your PATH environment variable.

> javac -d out src/**/*.java
> java -cp out Main

### Prerequisites

- Download PMD from its official website.
- Add PMD's /bin directory to your PATH environment variable
- Have Java installed.

### Command to Analyze with PMD

From the project's root directory, run:

pmd check -d src -R rulesets/java/quickstart.xml -f html -r reporte_pmd.html

> This command generates a pmd_report.html file with the analysis results.
