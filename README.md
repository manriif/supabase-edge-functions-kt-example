# supabase-edge-functions-kt-example
Example project for getting started with [supabase-edge-functions-kt](https://github.com/manriif/supabase-edge-functions-kt).

## Prepare your environment

- Prepare your machine for [supabase local development](https://supabase.com/docs/guides/cli/local-development)
  - Install [Docker Desktop](https://www.docker.com/products/docker-desktop/)
  and [Supabase CLI](https://supabase.com/docs/guides/cli) if it is not done yet.
  - Start Docker.
- Make sure you closed all running supabase local development stacks in order to release the required ports.
Otherwise you'll have to change the ports for required services in the [config](./supabase/config.toml) file.
- Start the supabase local development stack for the project (`supabase start`).

## hello-world [📁](functions/hello-world)

Simple Hello world function written in kotlin.

- Run the configuration `hello-world request` to serve the function and automatically send requests.
- Run the configuration `hello-world serve` and make request with your favorite 
tool such as Postman.

## call-js-from-kotlin [📁](functions/call-js-from-kotlin)

Example function demonstrating how to call a js function from kotlin side.

- Run the configuration `call-js-from-kotlin request` to serve the function and automatically send requests.
- Run the configuration `call-js-from-kotlin serve` and make request with your favorite
  tool such as Postman.

## call-kotlin-from-js [📁](functions/call-kotlin-from-js)

Example function demonstrating how to call a kotlin function from js side.

- Run the configuration `call-kotlin-from-js request` to serve the function and automatically send requests.
- Run the configuration `call-kotlin-from-js serve` and make request with your favorite
  tool such as Postman.

## call-js-in-another-module [📁](functions/call-js-in-another-module)

Example function demonstrating how to call a kotlin function that relies on a js function but located in another module.

- Run the configuration `call-js-in-another-module request` to serve the function and automatically send requests.
- Run the configuration `call-js-in-another-module serve` and make request with your favorite
  tool such as Postman.

## database-interaction [📁](functions/database-interaction)

Example function demonstrating how to use [supabase-kt](https://github.com/supabase-community/supabase-kt) to interact with the database.

- Run the configuration `database-interaction request` to serve the function and automatically send requests.
- Run the configuration `database-interaction serve` and make request with your favorite
  tool such as Postman.