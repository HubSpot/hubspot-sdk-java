// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.pipelines.PipelineCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineCreateStageParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineDeleteStageParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetStageParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineListAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineListStageAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineListStagesParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelinePatchInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineReplaceInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStageInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStagePatchInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStageReplaceInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateAllPropertiesParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateStageAllPropertiesParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateStageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PipelineServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val pipeline =
            pipelineService.create(
                PipelineCreateParams.builder()
                    .objectType("objectType")
                    .pipelineInput(
                        PipelineInput.builder()
                            .displayOrder(0)
                            .label("label")
                            .addStage(
                                PipelineStageInput.builder()
                                    .displayOrder(0)
                                    .label("label")
                                    .metadata(
                                        PipelineStageInput.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .stageId("stageId")
                                    .build()
                            )
                            .pipelineId("pipelineId")
                            .build()
                    )
                    .build()
            )

        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val pipeline =
            pipelineService.update(
                PipelineUpdateParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .validateDealStageUsagesBeforeDelete(true)
                    .validateReferencesBeforeDelete(true)
                    .pipelinePatchInput(
                        PipelinePatchInput.builder()
                            .archived(true)
                            .displayOrder(0)
                            .label("label")
                            .build()
                    )
                    .build()
            )

        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val collectionResponsePipelineNoPaging = pipelineService.list("objectType")

        collectionResponsePipelineNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        pipelineService.delete(
            PipelineDeleteParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .validateDealStageUsagesBeforeDelete(true)
                .validateReferencesBeforeDelete(true)
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createStage() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val pipelineStage =
            pipelineService.createStage(
                PipelineCreateStageParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .pipelineStageInput(
                        PipelineStageInput.builder()
                            .displayOrder(0)
                            .label("label")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .stageId("stageId")
                            .build()
                    )
                    .build()
            )

        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteStage() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        pipelineService.deleteStage(
            PipelineDeleteStageParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val pipeline =
            pipelineService.get(
                PipelineGetParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .build()
            )

        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStage() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val pipelineStage =
            pipelineService.getStage(
                PipelineGetStageParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAudit() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val collectionResponsePublicAuditInfoNoPaging =
            pipelineService.listAudit(
                PipelineListAuditParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .build()
            )

        collectionResponsePublicAuditInfoNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listStageAudit() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val collectionResponsePublicAuditInfoNoPaging =
            pipelineService.listStageAudit(
                PipelineListStageAuditParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        collectionResponsePublicAuditInfoNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listStages() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val collectionResponsePipelineStageNoPaging =
            pipelineService.listStages(
                PipelineListStagesParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .build()
            )

        collectionResponsePipelineStageNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateAllProperties() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val pipeline =
            pipelineService.updateAllProperties(
                PipelineUpdateAllPropertiesParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .validateDealStageUsagesBeforeDelete(true)
                    .validateReferencesBeforeDelete(true)
                    .pipelineReplaceInput(
                        PipelineReplaceInput.builder()
                            .displayOrder(0)
                            .label("label")
                            .addStage(
                                PipelineStageInput.builder()
                                    .displayOrder(0)
                                    .label("label")
                                    .metadata(
                                        PipelineStageInput.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .stageId("stageId")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateStage() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val pipelineStage =
            pipelineService.updateStage(
                PipelineUpdateStageParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .pipelineStagePatchInput(
                        PipelineStagePatchInput.builder()
                            .metadata(
                                PipelineStagePatchInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .archived(true)
                            .displayOrder(0)
                            .label("label")
                            .build()
                    )
                    .build()
            )

        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateStageAllProperties() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val pipelineService = client.crm().pipelines()

        val pipelineStage =
            pipelineService.updateStageAllProperties(
                PipelineUpdateStageAllPropertiesParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .pipelineStageReplaceInput(
                        PipelineStageReplaceInput.builder()
                            .displayOrder(0)
                            .label("label")
                            .metadata(
                                PipelineStageReplaceInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        pipelineStage.validate()
    }
}
