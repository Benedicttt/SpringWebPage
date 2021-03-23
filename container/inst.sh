#!/bin/bash

set -e
  apt-get update && apt-get install -y sudo

  cp /app/container/pg_hba.conf /etc/postgresql/10/main/ && cp /app/container/postgresql.conf /etc/postgresql/10/main/

  if service postgresql start; then
      echo "POSTGRES installed"
  fi

  if psql -U postgres -c "create database clients;"; then
      echo "DATABASE created"
  fi

  if psql -U postgres -c "create database test;"; then
      echo "DATABASE created"
  fi

  if psql -U postgres -c "create user clients;"; then
      echo "User created"
  fi

  if psql -U postgres -c "create user test;"; then
      echo "User created"
  fi

  if psql -U postgres -c "alter user clients password 'clients';"; then
      echo "User created"
  fi

  if psql -U postgres -c "alter user test password 'test';"; then
      echo "User created"
  fi

  if psql -U postgres -c "grant all privileges on database clients to clients;"; then
      echo "User created"
  fi

  if psql -U postgres -c "grant all privileges on database test to test;"; then
      echo "User created"
  fi

  if psql -U postgres -c "ALTER DATABASE test OWNER TO test;;"; then
      echo "User created"
  fi

  tail -f /dev/null
exec "$@"