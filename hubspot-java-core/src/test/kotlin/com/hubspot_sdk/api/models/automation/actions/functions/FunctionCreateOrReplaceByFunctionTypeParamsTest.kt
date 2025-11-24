// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions.functions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionCreateOrReplaceByFunctionTypeParamsTest {

    @Test
    fun create() {
        FunctionCreateOrReplaceByFunctionTypeParams.builder()
            .appId(0)
            .definitionId("definitionId")
            .functionType(
                FunctionCreateOrReplaceByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION
            )
            .body("body")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FunctionCreateOrReplaceByFunctionTypeParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(
                    FunctionCreateOrReplaceByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION
                )
                .body("body")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("definitionId")
        assertThat(params._pathParam(2)).isEqualTo("POST_ACTION_EXECUTION")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FunctionCreateOrReplaceByFunctionTypeParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(
                    FunctionCreateOrReplaceByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION
                )
                .body("body")
                .build()

        val body = params._body()

        assertThat(body).isEqualTo("body")
    }
}
