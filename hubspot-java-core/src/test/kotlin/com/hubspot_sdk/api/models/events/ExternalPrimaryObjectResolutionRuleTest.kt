// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalPrimaryObjectResolutionRuleTest {

    @Test
    fun create() {
        val externalPrimaryObjectResolutionRule =
            ExternalPrimaryObjectResolutionRule.builder()
                .eventPropertyName("eventPropertyName")
                .targetObjectPropertyName("targetObjectPropertyName")
                .build()

        assertThat(externalPrimaryObjectResolutionRule.eventPropertyName())
            .isEqualTo("eventPropertyName")
        assertThat(externalPrimaryObjectResolutionRule.targetObjectPropertyName())
            .isEqualTo("targetObjectPropertyName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalPrimaryObjectResolutionRule =
            ExternalPrimaryObjectResolutionRule.builder()
                .eventPropertyName("eventPropertyName")
                .targetObjectPropertyName("targetObjectPropertyName")
                .build()

        val roundtrippedExternalPrimaryObjectResolutionRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalPrimaryObjectResolutionRule),
                jacksonTypeRef<ExternalPrimaryObjectResolutionRule>(),
            )

        assertThat(roundtrippedExternalPrimaryObjectResolutionRule)
            .isEqualTo(externalPrimaryObjectResolutionRule)
    }
}
