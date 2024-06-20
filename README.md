# Hadoop-WeblogAnalyzer


# **Weblog Analysis**

This project analyzes web log files to extract useful information about user behavior and website performance.

Features
Data extraction: Parses web log files in various formats (e.g., Apache, Nginx) and extracts relevant data points such as IP address, timestamp, request method, URL, HTTP status code, user agent, and response size.
Data aggregation: Aggregates extracted data into meaningful summaries, such as page views per hour, unique visitors per day, most popular pages, and most common user agents.
Data visualization: Generates various charts and graphs to visualize the extracted data, providing insights into user behavior and website performance.
Anomaly detection: Identifies unusual patterns in the data, such as sudden spikes in traffic or unexpected errors, which may indicate potential issues or security threats.
Usage
Install dependencies:
Ensure you have Java 8 or later installed.
Run mvn install to download and install required libraries.
Prepare your data:
Place your web log files in the data directory.
Run the analysis:
Run mvn exec:java -Dexec.mainClass="WeblogAnalysis"
View the results:
The generated reports and visualizations will be saved in the output directory.
Technologies
Java
Apache Commons Logging
Apache Hadoop
Apache Spark
Apache Flink
Apache Beam
Apache Kafka
Apache Cassandra
Apache Zeppelin
Contributing
Contributions are welcome! Please refer to the CONTRIBUTING.md file for guidelines.

License
This project is licensed under the Apache License, Version 2.0. See the LICENSE file for details.

Disclaimer
This project is for educational and demonstration purposes only. It is not intended for production use.

link to datasets: https://ita.ee.lbl.gov/html/contrib/NASA-HTTP.html

if you need help installing and configuring hadoop, checkout: https://medium.com/@vikramus4/install-and-configure-hadoop-3-3-6-in-mac-os-dd4be4da8846

