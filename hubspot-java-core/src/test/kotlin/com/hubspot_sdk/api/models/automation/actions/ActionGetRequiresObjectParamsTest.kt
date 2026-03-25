// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGetRequiresObjectParamsTest {

    @Test
    fun create() {
        ActionGetRequiresObjectParams.builder().appId(0).definitionId("definitionId").build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionGetRequiresObjectParams.builder().appId(0).definitionId("definitionId").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("definitionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
