// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionCreateOrReplaceParamsTest {

    @Test
    fun create() {
        ActionCreateOrReplaceParams.builder()
            .appId(0)
            .definitionId("definitionId")
            .functionType(ActionCreateOrReplaceParams.FunctionType.POST_ACTION_EXECUTION)
            .functionId("functionId")
            .body("body")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionCreateOrReplaceParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(ActionCreateOrReplaceParams.FunctionType.POST_ACTION_EXECUTION)
                .functionId("functionId")
                .body("body")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("definitionId")
        assertThat(params._pathParam(2)).isEqualTo("POST_ACTION_EXECUTION")
        assertThat(params._pathParam(3)).isEqualTo("functionId")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionCreateOrReplaceParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(ActionCreateOrReplaceParams.FunctionType.POST_ACTION_EXECUTION)
                .functionId("functionId")
                .body("body")
                .build()

        val body = params._body()

        assertThat(body).isEqualTo("body")
    }
}
