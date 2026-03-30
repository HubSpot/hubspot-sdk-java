// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalObjectResolutionMappingResponseTest {

    @Test
    fun create() {
        val externalObjectResolutionMappingResponse =
            ExternalObjectResolutionMappingResponse.builder()
                .primaryObjectRule(
                    ExternalPrimaryObjectResolutionRule.builder()
                        .eventPropertyName("eventPropertyName")
                        .targetObjectPropertyName("targetObjectPropertyName")
                        .build()
                )
                .build()

        assertThat(externalObjectResolutionMappingResponse.primaryObjectRule())
            .isEqualTo(
                ExternalPrimaryObjectResolutionRule.builder()
                    .eventPropertyName("eventPropertyName")
                    .targetObjectPropertyName("targetObjectPropertyName")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalObjectResolutionMappingResponse =
            ExternalObjectResolutionMappingResponse.builder()
                .primaryObjectRule(
                    ExternalPrimaryObjectResolutionRule.builder()
                        .eventPropertyName("eventPropertyName")
                        .targetObjectPropertyName("targetObjectPropertyName")
                        .build()
                )
                .build()

        val roundtrippedExternalObjectResolutionMappingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalObjectResolutionMappingResponse),
                jacksonTypeRef<ExternalObjectResolutionMappingResponse>(),
            )

        assertThat(roundtrippedExternalObjectResolutionMappingResponse)
            .isEqualTo(externalObjectResolutionMappingResponse)
    }
}
