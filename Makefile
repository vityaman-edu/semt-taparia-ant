.ONESHELL: clean war infra

clean:
	ant clean

start-docker:
	sudo systemctl start docker

prepare-app:
	cd src/main/taparia-app/src/main/webapp
	npm install
	npx tsc
	cd ../../../..

prepare-api:


wars: prepare-api prepare-app
	mvn package

ant-wars: prepare-api prepare-app
	ant build

infra: clean ant-wars Dockerfile docker-compose.yml
	sudo docker compose down
	sudo docker compose build --no-cache
	sudo docker compose up --build --force-recreate

infra-stop:
	docker compose stop

make-ant: prepare-api prepare-app
	ant
