// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.carts.batch

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.BatchInputSimplePublicObjectBatchInputForCreate
import com.hubspot_sdk.api.models.crm.PublicAssociationsForObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectBatchInputForCreate
import com.hubspot_sdk.api.models.crm.associations.v4.AssociationSpec1
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateParamsTest {

    @Test
    fun create() {
        BatchCreateParams.builder()
            .batchInputSimplePublicObjectBatchInputForCreate(
                BatchInputSimplePublicObjectBatchInputForCreate.builder()
                    .addInput(
                        SimplePublicObjectBatchInputForCreate.builder()
                            .properties(
                                SimplePublicObjectBatchInputForCreate.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addAssociation(
                                PublicAssociationsForObject.builder()
                                    .to(PublicObjectId.builder().id("37295").build())
                                    .addType(
                                        AssociationSpec1.builder()
                                            .associationCategory(
                                                AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                            )
                                            .associationTypeId(0)
                                            .build()
                                    )
                                    .build()
                            )
                            .objectWriteTraceId("objectWriteTraceId")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BatchCreateParams.builder()
                .batchInputSimplePublicObjectBatchInputForCreate(
                    BatchInputSimplePublicObjectBatchInputForCreate.builder()
                        .addInput(
                            SimplePublicObjectBatchInputForCreate.builder()
                                .properties(
                                    SimplePublicObjectBatchInputForCreate.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addAssociation(
                                    PublicAssociationsForObject.builder()
                                        .to(PublicObjectId.builder().id("37295").build())
                                        .addType(
                                            AssociationSpec1.builder()
                                                .associationCategory(
                                                    AssociationSpec1.AssociationCategory
                                                        .HUBSPOT_DEFINED
                                                )
                                                .associationTypeId(0)
                                                .build()
                                        )
                                        .build()
                                )
                                .objectWriteTraceId("objectWriteTraceId")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputSimplePublicObjectBatchInputForCreate.builder()
                    .addInput(
                        SimplePublicObjectBatchInputForCreate.builder()
                            .properties(
                                SimplePublicObjectBatchInputForCreate.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addAssociation(
                                PublicAssociationsForObject.builder()
                                    .to(PublicObjectId.builder().id("37295").build())
                                    .addType(
                                        AssociationSpec1.builder()
                                            .associationCategory(
                                                AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                            )
                                            .associationTypeId(0)
                                            .build()
                                    )
                                    .build()
                            )
                            .objectWriteTraceId("objectWriteTraceId")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchCreateParams.builder()
                .batchInputSimplePublicObjectBatchInputForCreate(
                    BatchInputSimplePublicObjectBatchInputForCreate.builder()
                        .addInput(
                            SimplePublicObjectBatchInputForCreate.builder()
                                .properties(
                                    SimplePublicObjectBatchInputForCreate.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputSimplePublicObjectBatchInputForCreate.builder()
                    .addInput(
                        SimplePublicObjectBatchInputForCreate.builder()
                            .properties(
                                SimplePublicObjectBatchInputForCreate.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
