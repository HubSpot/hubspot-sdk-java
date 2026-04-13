// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalObjectResolutionMappingRequestTest {

    @Test
    fun create() {
        val externalObjectResolutionMappingRequest =
            ExternalObjectResolutionMappingRequest.builder()
                .primaryObjectRule(
                    ExternalPrimaryObjectResolutionRule.builder()
                        .eventPropertyName("eventPropertyName")
                        .targetObjectPropertyName("targetObjectPropertyName")
                        .build()
                )
                .build()

        assertThat(externalObjectResolutionMappingRequest.primaryObjectRule())
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
        val externalObjectResolutionMappingRequest =
            ExternalObjectResolutionMappingRequest.builder()
                .primaryObjectRule(
                    ExternalPrimaryObjectResolutionRule.builder()
                        .eventPropertyName("eventPropertyName")
                        .targetObjectPropertyName("targetObjectPropertyName")
                        .build()
                )
                .build()

        val roundtrippedExternalObjectResolutionMappingRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalObjectResolutionMappingRequest),
                jacksonTypeRef<ExternalObjectResolutionMappingRequest>(),
            )

        assertThat(roundtrippedExternalObjectResolutionMappingRequest)
            .isEqualTo(externalObjectResolutionMappingRequest)
    }
}
