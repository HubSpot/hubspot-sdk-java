// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPermissionSetTest {

    @Test
    fun create() {
        val publicPermissionSet =
            PublicPermissionSet.builder()
                .id("100")
                .name("Test Role")
                .requiresBillingWrite(true)
                .build()

        assertThat(publicPermissionSet.id()).isEqualTo("100")
        assertThat(publicPermissionSet.name()).isEqualTo("Test Role")
        assertThat(publicPermissionSet.requiresBillingWrite()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicPermissionSet =
            PublicPermissionSet.builder()
                .id("100")
                .name("Test Role")
                .requiresBillingWrite(true)
                .build()

        val roundtrippedPublicPermissionSet =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPermissionSet),
                jacksonTypeRef<PublicPermissionSet>(),
            )

        assertThat(roundtrippedPublicPermissionSet).isEqualTo(publicPermissionSet)
    }
}
