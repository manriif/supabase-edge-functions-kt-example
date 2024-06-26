# supabase-edge-functions-kt-example
Examples project for getting started with supabase-edge-functions-kt

## Running functions

- Install [Docker](https://www.docker.com/products/docker-desktop/) 
and [Supabase CLI](https://supabase.com/docs/guides/cli) if it is not done yet.
- Start Docker.
- Make sure you closed all running supabase local development stacks in order to release the required ports.
Otherwise you'll have to change the ports for required services in the [config](./supabase/config.toml) file.
- Start the supabase local development stack for the project (`supabase start`).

## hello-world

Simple Hello world function written in kotlin.

- Run the configuration `hello-world request` to serve the function and automatically send requests.
- Run the configuration `hello-world serve` and make request with your favorite 
tool such as Postman.

## request-count

