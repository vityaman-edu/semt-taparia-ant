.ONESHELL: clean wars infra

clean:
	ant clean

prepare-app:
	cd src/main/taparia-app/src/main/webapp
	npm install
	npx tsc
	cd ../../../..

prepare-api:


wars: prepare-api prepare-app
	mvn package

ant-wars: prepare-api prepare-app
	ant

docker:
	sudo systemctl start docker

infra: clean ant-wars Dockerfile docker-compose.yml
	sudo docker compose down
	sudo docker compose build --no-cache
	sudo docker compose up --build --force-recreate

infra-stop:
	docker compose stop
