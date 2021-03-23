FROM ubuntu:18.04
ENV LC_ALL="1"

WORKDIR /app
COPY . /app

EXPOSE 3000
EXPOSE 5432

RUN apt update
RUN apt install -y postgresql postgresql-client net-tools lsof vim libpq-dev xvfb nodejs nano  sudo dos2unix redis-server
RUN Xvfb :99 -ac &

ENV DISPLAY=:99

CMD ["tail", "-f", "/dev/null"]

