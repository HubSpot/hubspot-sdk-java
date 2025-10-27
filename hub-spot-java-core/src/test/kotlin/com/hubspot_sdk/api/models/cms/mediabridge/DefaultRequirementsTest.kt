// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefaultRequirementsTest {

    @Test
    fun create() {
        val defaultRequirements =
            DefaultRequirements.builder()
                .addGate("string")
                .operator(DefaultRequirements.Operator.AND)
                .addScopeName("string")
                .addSetting("string")
                .build()

        assertThat(defaultRequirements.gates()).containsExactly("string")
        assertThat(defaultRequirements.operator()).isEqualTo(DefaultRequirements.Operator.AND)
        assertThat(defaultRequirements.scopeNames()).containsExactly("string")
        assertThat(defaultRequirements.settings()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val defaultRequirements =
            DefaultRequirements.builder()
                .addGate("string")
                .operator(DefaultRequirements.Operator.AND)
                .addScopeName("string")
                .addSetting("string")
                .build()

        val roundtrippedDefaultRequirements =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(defaultRequirements),
                jacksonTypeRef<DefaultRequirements>(),
            )

        assertThat(roundtrippedDefaultRequirements).isEqualTo(defaultRequirements)
    }
}
