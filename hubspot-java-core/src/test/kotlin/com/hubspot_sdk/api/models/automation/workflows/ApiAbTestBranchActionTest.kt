// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiAbTestBranchActionTest {

    @Test
    fun create() {
        val apiAbTestBranchAction =
            ApiAbTestBranchAction.builder()
                .actionId("actionId")
                .addTestBranch(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .type(ApiAbTestBranchAction.Type.AB_TEST_BRANCH)
                .build()

        assertThat(apiAbTestBranchAction.actionId()).isEqualTo("actionId")
        assertThat(apiAbTestBranchAction.testBranches())
            .containsExactly(
                ApiConnection.builder().edgeType("edgeType").nextActionId("nextActionId").build()
            )
        assertThat(apiAbTestBranchAction.type())
            .isEqualTo(ApiAbTestBranchAction.Type.AB_TEST_BRANCH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiAbTestBranchAction =
            ApiAbTestBranchAction.builder()
                .actionId("actionId")
                .addTestBranch(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .type(ApiAbTestBranchAction.Type.AB_TEST_BRANCH)
                .build()

        val roundtrippedApiAbTestBranchAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiAbTestBranchAction),
                jacksonTypeRef<ApiAbTestBranchAction>(),
            )

        assertThat(roundtrippedApiAbTestBranchAction).isEqualTo(apiAbTestBranchAction)
    }
}
