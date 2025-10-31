// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiSingleConnectionActionTest {

    @Test
    fun create() {
        val apiSingleConnectionAction =
            ApiSingleConnectionAction.builder()
                .actionId("actionId")
                .actionTypeId("actionTypeId")
                .actionTypeVersion(0)
                .fields(
                    ApiSingleConnectionAction.Fields.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .type(ApiSingleConnectionAction.Type.SINGLE_CONNECTION)
                .connection(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .build()

        assertThat(apiSingleConnectionAction.actionId()).isEqualTo("actionId")
        assertThat(apiSingleConnectionAction.actionTypeId()).isEqualTo("actionTypeId")
        assertThat(apiSingleConnectionAction.actionTypeVersion()).isEqualTo(0)
        assertThat(apiSingleConnectionAction.fields())
            .isEqualTo(
                ApiSingleConnectionAction.Fields.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(apiSingleConnectionAction.type())
            .isEqualTo(ApiSingleConnectionAction.Type.SINGLE_CONNECTION)
        assertThat(apiSingleConnectionAction.connection())
            .contains(
                ApiConnection.builder().edgeType("edgeType").nextActionId("nextActionId").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiSingleConnectionAction =
            ApiSingleConnectionAction.builder()
                .actionId("actionId")
                .actionTypeId("actionTypeId")
                .actionTypeVersion(0)
                .fields(
                    ApiSingleConnectionAction.Fields.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .type(ApiSingleConnectionAction.Type.SINGLE_CONNECTION)
                .connection(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .build()

        val roundtrippedApiSingleConnectionAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiSingleConnectionAction),
                jacksonTypeRef<ApiSingleConnectionAction>(),
            )

        assertThat(roundtrippedApiSingleConnectionAction).isEqualTo(apiSingleConnectionAction)
    }
}
