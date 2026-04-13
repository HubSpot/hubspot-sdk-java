// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.goaltargets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GoalTargetDeleteParamsTest {

    @Test
    fun create() {
        GoalTargetDeleteParams.builder().goalTargetId("goalTargetId").build()
    }

    @Test
    fun pathParams() {
        val params = GoalTargetDeleteParams.builder().goalTargetId("goalTargetId").build()

        assertThat(params._pathParam(0)).isEqualTo("goalTargetId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
