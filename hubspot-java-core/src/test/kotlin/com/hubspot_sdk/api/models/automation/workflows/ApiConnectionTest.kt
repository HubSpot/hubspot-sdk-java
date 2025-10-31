// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiConnectionTest {

    @Test
    fun create() {
        val apiConnection =
            ApiConnection.builder().edgeType("edgeType").nextActionId("nextActionId").build()

        assertThat(apiConnection.edgeType()).isEqualTo("edgeType")
        assertThat(apiConnection.nextActionId()).isEqualTo("nextActionId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiConnection =
            ApiConnection.builder().edgeType("edgeType").nextActionId("nextActionId").build()

        val roundtrippedApiConnection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiConnection),
                jacksonTypeRef<ApiConnection>(),
            )

        assertThat(roundtrippedApiConnection).isEqualTo(apiConnection)
    }
}
