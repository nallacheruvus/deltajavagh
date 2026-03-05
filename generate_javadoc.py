import subprocess
import os

os.chdir("C:\\Users\\satis\\eclipse-workspaceb\\deltajavahi\\FifthProj")

# Create javadoc directory if it doesn't exist
if not os.path.exists("javadoc"):
    os.makedirs("javadoc")

# Generate JavaDoc
cmd = [
    "javadoc",
    "-d", "./javadoc",
    "-sourcepath", "./src",
    "-private",
    "-author",
    "-version",
    "-windowtitle", "FifthProj Java API Documentation",
    "-doctitle", "FifthProj - Java Application Documentation",
    "-bottom", "Copyright 2026 Development Team. All rights reserved.",
    "com.sa.cls",
    "com.sa.db",
    "com.sa.recs",
    "comm.sa.inte"
]

result = subprocess.run(cmd, capture_output=True, text=True)
print(result.stdout)
if result.stderr:
    print("STDERR:", result.stderr)
print(f"Return code: {result.returncode}")
