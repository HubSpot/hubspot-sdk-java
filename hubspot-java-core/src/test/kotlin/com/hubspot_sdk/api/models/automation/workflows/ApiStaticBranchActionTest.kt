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
                .actionId("actionId")
                .inputValue(
                    ApiActionDataValue.builder()
                        .actionId("actionId")
                        .dataKey("dataKey")
                        .type(ApiActionDataValue.Type.FIELD_DATA)
                        .build()
                )
                .addStaticBranch(
                    ApiStaticBranch.builder()
                        .branchValue("branchValue")
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
                .defaultBranchName("defaultBranchName")
                .build()

        assertThat(apiStaticBranchAction.actionId()).isEqualTo("actionId")
        assertThat(apiStaticBranchAction.inputValue())
            .isEqualTo(
                ApiStaticBranchAction.InputValue.ofApiActionData(
                    ApiActionDataValue.builder()
                        .actionId("actionId")
                        .dataKey("dataKey")
                        .type(ApiActionDataValue.Type.FIELD_DATA)
                        .build()
                )
            )
        assertThat(apiStaticBranchAction.staticBranches())
            .containsExactly(
                ApiStaticBranch.builder()
                    .branchValue("branchValue")
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
        assertThat(apiStaticBranchAction.defaultBranchName()).contains("defaultBranchName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiStaticBranchAction =
            ApiStaticBranchAction.builder()
                .actionId("actionId")
                .inputValue(
                    ApiActionDataValue.builder()
                        .actionId("actionId")
                        .dataKey("dataKey")
                        .type(ApiActionDataValue.Type.FIELD_DATA)
                        .build()
                )
                .addStaticBranch(
                    ApiStaticBranch.builder()
                        .branchValue("branchValue")
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
                .defaultBranchName("defaultBranchName")
                .build()

        val roundtrippedApiStaticBranchAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiStaticBranchAction),
                jacksonTypeRef<ApiStaticBranchAction>(),
            )

        assertThat(roundtrippedApiStaticBranchAction).isEqualTo(apiStaticBranchAction)
    }
}
