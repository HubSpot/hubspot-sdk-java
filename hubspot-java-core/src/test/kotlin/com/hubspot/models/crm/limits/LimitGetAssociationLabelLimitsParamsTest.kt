// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.limits

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LimitGetAssociationLabelLimitsParamsTest {

    @Test
    fun create() {
        LimitGetAssociationLabelLimitsParams.builder()
            .fromObjectTypeId("fromObjectTypeId")
            .toObjectTypeId("toObjectTypeId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LimitGetAssociationLabelLimitsParams.builder()
                .fromObjectTypeId("fromObjectTypeId")
                .toObjectTypeId("toObjectTypeId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("fromObjectTypeId", "fromObjectTypeId")
                    .put("toObjectTypeId", "toObjectTypeId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LimitGetAssociationLabelLimitsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
