// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPermissionSetTest {

    @Test
    fun create() {
        val publicPermissionSet =
            PublicPermissionSet.builder().id("id").name("name").requiresBillingWrite(true).build()

        assertThat(publicPermissionSet.id()).isEqualTo("id")
        assertThat(publicPermissionSet.name()).isEqualTo("name")
        assertThat(publicPermissionSet.requiresBillingWrite()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicPermissionSet =
            PublicPermissionSet.builder().id("id").name("name").requiresBillingWrite(true).build()

        val roundtrippedPublicPermissionSet =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPermissionSet),
                jacksonTypeRef<PublicPermissionSet>(),
            )

        assertThat(roundtrippedPublicPermissionSet).isEqualTo(publicPermissionSet)
    }
}
