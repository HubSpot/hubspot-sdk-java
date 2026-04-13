// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objectlibrary.enablement

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnablementGetByObjectTypeIdParamsTest {

    @Test
    fun create() {
        EnablementGetByObjectTypeIdParams.builder().objectTypeId("objectTypeId").build()
    }

    @Test
    fun pathParams() {
        val params =
            EnablementGetByObjectTypeIdParams.builder().objectTypeId("objectTypeId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectTypeId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
