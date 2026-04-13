// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicActionDefinitionRequiresObjectRequestTest {

    @Test
    fun create() {
        val publicActionDefinitionRequiresObjectRequest =
            PublicActionDefinitionRequiresObjectRequest.builder().requiresObject(true).build()

        assertThat(publicActionDefinitionRequiresObjectRequest.requiresObject()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicActionDefinitionRequiresObjectRequest =
            PublicActionDefinitionRequiresObjectRequest.builder().requiresObject(true).build()

        val roundtrippedPublicActionDefinitionRequiresObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActionDefinitionRequiresObjectRequest),
                jacksonTypeRef<PublicActionDefinitionRequiresObjectRequest>(),
            )

        assertThat(roundtrippedPublicActionDefinitionRequiresObjectRequest)
            .isEqualTo(publicActionDefinitionRequiresObjectRequest)
    }
}
