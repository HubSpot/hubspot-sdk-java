// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiStaticBranchActionTest {

    @Test
    fun create() {
        val apiStaticBranchAction =
            ApiStaticBranchAction.builder()
                .actionId("1")
                .inputValue(
                    ApiActionDataValue.builder()
                        .actionId("1")
                        .dataKey("hs_execution_state")
                        .type(ApiActionDataValue.Type.FIELD_DATA)
                        .build()
                )
                .addStaticBranch(
                    ApiStaticBranch.builder()
                        .branchValue("some_value")
                        .connection(
                            ApiConnection.builder()
                                .edgeType("edgeType")
                                .nextActionId("nextActionId")
                                .build()
                        )
                        .build()
                )
                .type(ApiStaticBranchAction.Type.STATIC_BRANCH)
                .defaultBranch(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .defaultBranchName("Other")
                .build()

        assertThat(apiStaticBranchAction.actionId()).isEqualTo("1")
        assertThat(apiStaticBranchAction.inputValue())
            .isEqualTo(
                ApiStaticBranchAction.InputValue.ofApiActionData(
                    ApiActionDataValue.builder()
                        .actionId("1")
                        .dataKey("hs_execution_state")
                        .type(ApiActionDataValue.Type.FIELD_DATA)
                        .build()
                )
            )
        assertThat(apiStaticBranchAction.staticBranches())
            .containsExactly(
                ApiStaticBranch.builder()
                    .branchValue("some_value")
                    .connection(
                        ApiConnection.builder()
                            .edgeType("edgeType")
                            .nextActionId("nextActionId")
                            .build()
                    )
                    .build()
            )
        assertThat(apiStaticBranchAction.type()).isEqualTo(ApiStaticBranchAction.Type.STATIC_BRANCH)
        assertThat(apiStaticBranchAction.defaultBranch())
            .contains(
                ApiConnection.builder().edgeType("edgeType").nextActionId("nextActionId").build()
            )
        assertThat(apiStaticBranchAction.defaultBranchName()).contains("Other")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiStaticBranchAction =
            ApiStaticBranchAction.builder()
                .actionId("1")
                .inputValue(
                    ApiActionDataValue.builder()
                        .actionId("1")
                        .dataKey("hs_execution_state")
                        .type(ApiActionDataValue.Type.FIELD_DATA)
                        .build()
                )
                .addStaticBranch(
                    ApiStaticBranch.builder()
                        .branchValue("some_value")
                        .connection(
                            ApiConnection.builder()
                                .edgeType("edgeType")
                                .nextActionId("nextActionId")
                                .build()
                        )
                        .build()
                )
                .type(ApiStaticBranchAction.Type.STATIC_BRANCH)
                .defaultBranch(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .defaultBranchName("Other")
                .build()

        val roundtrippedApiStaticBranchAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiStaticBranchAction),
                jacksonTypeRef<ApiStaticBranchAction>(),
            )

        assertThat(roundtrippedApiStaticBranchAction).isEqualTo(apiStaticBranchAction)
    }
}
