package io.github.manriif.supabase.functions.example

import io.github.jan.supabase.gotrue.Auth
import io.github.jan.supabase.gotrue.MemoryCodeVerifierCache
import io.github.jan.supabase.gotrue.MemorySessionManager
import io.github.jan.supabase.postgrest.Postgrest
import io.github.manriif.supabase.functions.binding.deno.Deno
import io.github.manriif.supabase.functions.binding.deno.SupabaseSecrets
import io.github.manriif.supabase.functions.binding.deno.require

fun createSupabaseAnonClient() = createSupabaseClient(key = SupabaseSecrets.ANON_KEY)

fun createSupabaseAdminClient() = createSupabaseClient(key = SupabaseSecrets.SERVICE_ROLE_KEY)

private fun createSupabaseClient(key: String) = io.github.jan.supabase.createSupabaseClient(
    supabaseUrl = Deno.env.require(SupabaseSecrets.URL),
    supabaseKey = Deno.env.require(key)
) {
    install(Auth) {
        codeVerifierCache = MemoryCodeVerifierCache()
        sessionManager = MemorySessionManager()
    }

    install(Postgrest)
}