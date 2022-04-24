# cucumberTestingMasterClass
Start a Docker container with Firefox

docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-firefox:latest

Point your WebDriver tests to http://localhost:4444

That's it!

(Optional) To see what is happening inside the container, head to http://localhost:7900 (password is secret).
