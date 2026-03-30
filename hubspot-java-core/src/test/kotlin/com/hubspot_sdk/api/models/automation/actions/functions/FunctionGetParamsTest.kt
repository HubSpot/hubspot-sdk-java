// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions.functions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionGetParamsTest {

    @Test
    fun create() {
        FunctionGetParams.builder()
            .appId(0)
            .definitionId("definitionId")
            .functionType(FunctionGetParams.FunctionType.POST_ACTION_EXECUTION)
            .functionId("functionId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FunctionGetParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(FunctionGetParams.FunctionType.POST_ACTION_EXECUTION)
                .functionId("functionId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("definitionId")
        assertThat(params._pathParam(2)).isEqualTo("POST_ACTION_EXECUTION")
        assertThat(params._pathParam(3)).isEqualTo("functionId")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }
}
