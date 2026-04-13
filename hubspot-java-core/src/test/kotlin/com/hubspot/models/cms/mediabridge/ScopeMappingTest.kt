// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopeMappingTest {

    @Test
    fun create() {
        val scopeMapping =
            ScopeMapping.builder()
                .accessLevel(ScopeMapping.AccessLevel.ALL)
                .requestAction(ScopeMapping.RequestAction.COMMUNICATE)
                .scopeName("scopeName")
                .build()

        assertThat(scopeMapping.accessLevel()).isEqualTo(ScopeMapping.AccessLevel.ALL)
        assertThat(scopeMapping.requestAction()).isEqualTo(ScopeMapping.RequestAction.COMMUNICATE)
        assertThat(scopeMapping.scopeName()).isEqualTo("scopeName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopeMapping =
            ScopeMapping.builder()
                .accessLevel(ScopeMapping.AccessLevel.ALL)
                .requestAction(ScopeMapping.RequestAction.COMMUNICATE)
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
