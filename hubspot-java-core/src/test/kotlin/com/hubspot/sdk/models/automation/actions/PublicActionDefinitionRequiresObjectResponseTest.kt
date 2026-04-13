// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicActionDefinitionRequiresObjectResponseTest {

    @Test
    fun create() {
        val publicActionDefinitionRequiresObjectResponse =
            PublicActionDefinitionRequiresObjectResponse.builder().requiresObject(true).build()

        assertThat(publicActionDefinitionRequiresObjectResponse.requiresObject()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicActionDefinitionRequiresObjectResponse =
            PublicActionDefinitionRequiresObjectResponse.builder().requiresObject(true).build()

        val roundtrippedPublicActionDefinitionRequiresObjectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActionDefinitionRequiresObjectResponse),
                jacksonTypeRef<PublicActionDefinitionRequiresObjectResponse>(),
            )

        assertThat(roundtrippedPublicActionDefinitionRequiresObjectResponse)
            .isEqualTo(publicActionDefinitionRequiresObjectResponse)
    }
}
