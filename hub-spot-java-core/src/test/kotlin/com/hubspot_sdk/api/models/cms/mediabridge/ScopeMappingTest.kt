// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopeMappingTest {

    @Test
    fun create() {
        val scopeMapping =
            ScopeMapping.builder()
                .accessLevel("accessLevel")
                .requestAction("requestAction")
                .scopeName("scopeName")
                .build()

        assertThat(scopeMapping.accessLevel()).isEqualTo("accessLevel")
        assertThat(scopeMapping.requestAction()).isEqualTo("requestAction")
        assertThat(scopeMapping.scopeName()).isEqualTo("scopeName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopeMapping =
            ScopeMapping.builder()
                .accessLevel("accessLevel")
                .requestAction("requestAction")
                .scopeName("scopeName")
                .build()

        val roundtrippedScopeMapping =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scopeMapping),
                jacksonTypeRef<ScopeMapping>(),
            )

        assertThat(roundtrippedScopeMapping).isEqualTo(scopeMapping)
    }
}
