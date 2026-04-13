// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationRequestHighUsageReportParamsTest {

    @Test
    fun create() {
        AssociationRequestHighUsageReportParams.builder().userId(0).build()
    }

    @Test
    fun pathParams() {
        val params = AssociationRequestHighUsageReportParams.builder().userId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
