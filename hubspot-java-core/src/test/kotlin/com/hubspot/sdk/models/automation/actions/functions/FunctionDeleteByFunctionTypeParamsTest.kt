// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions.functions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionDeleteByFunctionTypeParamsTest {

    @Test
    fun create() {
        FunctionDeleteByFunctionTypeParams.builder()
            .appId(0)
            .definitionId("definitionId")
            .functionType(FunctionDeleteByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FunctionDeleteByFunctionTypeParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(FunctionDeleteByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("definitionId")
        assertThat(params._pathParam(2)).isEqualTo("POST_ACTION_EXECUTION")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
