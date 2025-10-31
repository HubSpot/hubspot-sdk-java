// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiStaticBranchTest {

    @Test
    fun create() {
        val apiStaticBranch =
            ApiStaticBranch.builder()
                .branchValue("some_value")
                .connection(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .build()

        assertThat(apiStaticBranch.branchValue()).isEqualTo("some_value")
        assertThat(apiStaticBranch.connection())
            .contains(
                ApiConnection.builder().edgeType("edgeType").nextActionId("nextActionId").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiStaticBranch =
            ApiStaticBranch.builder()
                .branchValue("some_value")
                .connection(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .build()

        val roundtrippedApiStaticBranch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiStaticBranch),
                jacksonTypeRef<ApiStaticBranch>(),
            )

        assertThat(roundtrippedApiStaticBranch).isEqualTo(apiStaticBranch)
    }
}
