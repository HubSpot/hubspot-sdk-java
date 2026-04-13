// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects.services.batch

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.AssociationSpec
import com.hubspot.sdk.models.PublicObjectId
import com.hubspot.sdk.models.crm.objects.BatchInputSimplePublicObjectBatchInputForCreate
import com.hubspot.sdk.models.crm.objects.PublicAssociationsForObject
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectBatchInputForCreate
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
                            .addAssociation(
                                PublicAssociationsForObject.builder()
                                    .to(PublicObjectId.builder().id("id").build())
                                    .addType(
                                        AssociationSpec.builder()
                                            .associationCategory(
                                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                            )
                                            .associationTypeId(0)
                                            .build()
                                    )
                                    .build()
                            )
                            .properties(
                                SimplePublicObjectBatchInputForCreate.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
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
                                .addAssociation(
                                    PublicAssociationsForObject.builder()
                                        .to(PublicObjectId.builder().id("id").build())
                                        .addType(
                                            AssociationSpec.builder()
                                                .associationCategory(
                                                    AssociationSpec.AssociationCategory
                                                        .HUBSPOT_DEFINED
                                                )
                                                .associationTypeId(0)
                                                .build()
                                        )
                                        .build()
                                )
                                .properties(
                                    SimplePublicObjectBatchInputForCreate.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
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
                            .addAssociation(
                                PublicAssociationsForObject.builder()
                                    .to(PublicObjectId.builder().id("id").build())
                                    .addType(
                                        AssociationSpec.builder()
                                            .associationCategory(
                                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                            )
                                            .associationTypeId(0)
                                            .build()
                                    )
                                    .build()
                            )
                            .properties(
                                SimplePublicObjectBatchInputForCreate.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
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
                                .addAssociation(
                                    PublicAssociationsForObject.builder()
                                        .to(PublicObjectId.builder().id("id").build())
                                        .addType(
                                            AssociationSpec.builder()
                                                .associationCategory(
                                                    AssociationSpec.AssociationCategory
                                                        .HUBSPOT_DEFINED
                                                )
                                                .associationTypeId(0)
                                                .build()
                                        )
                                        .build()
                                )
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
                            .addAssociation(
                                PublicAssociationsForObject.builder()
                                    .to(PublicObjectId.builder().id("id").build())
                                    .addType(
                                        AssociationSpec.builder()
                                            .associationCategory(
                                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                            )
                                            .associationTypeId(0)
                                            .build()
                                    )
                                    .build()
                            )
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
