// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.core.JsonValue
import com.hubspot.models.crm.pipelines.PipelineCreateParams
import com.hubspot.models.crm.pipelines.PipelineCreateStageParams
import com.hubspot.models.crm.pipelines.PipelineDeleteParams
import com.hubspot.models.crm.pipelines.PipelineDeleteStageParams
import com.hubspot.models.crm.pipelines.PipelineGetParams
import com.hubspot.models.crm.pipelines.PipelineGetStageParams
import com.hubspot.models.crm.pipelines.PipelineInput
import com.hubspot.models.crm.pipelines.PipelineListAuditParams
import com.hubspot.models.crm.pipelines.PipelineListStageAuditParams
import com.hubspot.models.crm.pipelines.PipelineListStagesParams
import com.hubspot.models.crm.pipelines.PipelinePatchInput
import com.hubspot.models.crm.pipelines.PipelineReplaceInput
import com.hubspot.models.crm.pipelines.PipelineStageInput
import com.hubspot.models.crm.pipelines.PipelineStagePatchInput
import com.hubspot.models.crm.pipelines.PipelineStageReplaceInput
import com.hubspot.models.crm.pipelines.PipelineUpdateAllPropertiesParams
import com.hubspot.models.crm.pipelines.PipelineUpdateParams
import com.hubspot.models.crm.pipelines.PipelineUpdateStageAllPropertiesParams
import com.hubspot.models.crm.pipelines.PipelineUpdateStageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PipelineServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineFuture =
            pipelineServiceAsync.create(
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

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineFuture =
            pipelineServiceAsync.update(
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

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val collectionResponsePipelineNoPagingFuture = pipelineServiceAsync.list("objectType")

        val collectionResponsePipelineNoPaging = collectionResponsePipelineNoPagingFuture.get()
        collectionResponsePipelineNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val future =
            pipelineServiceAsync.delete(
                PipelineDeleteParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .validateDealStageUsagesBeforeDelete(true)
                    .validateReferencesBeforeDelete(true)
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createStage() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineStageFuture =
            pipelineServiceAsync.createStage(
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

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteStage() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val future =
            pipelineServiceAsync.deleteStage(
                PipelineDeleteStageParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineFuture =
            pipelineServiceAsync.get(
                PipelineGetParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .build()
            )

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStage() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineStageFuture =
            pipelineServiceAsync.getStage(
                PipelineGetStageParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAudit() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val collectionResponsePublicAuditInfoNoPagingFuture =
            pipelineServiceAsync.listAudit(
                PipelineListAuditParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .build()
            )

        val collectionResponsePublicAuditInfoNoPaging =
            collectionResponsePublicAuditInfoNoPagingFuture.get()
        collectionResponsePublicAuditInfoNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listStageAudit() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val collectionResponsePublicAuditInfoNoPagingFuture =
            pipelineServiceAsync.listStageAudit(
                PipelineListStageAuditParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        val collectionResponsePublicAuditInfoNoPaging =
            collectionResponsePublicAuditInfoNoPagingFuture.get()
        collectionResponsePublicAuditInfoNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listStages() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val collectionResponsePipelineStageNoPagingFuture =
            pipelineServiceAsync.listStages(
                PipelineListStagesParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .build()
            )

        val collectionResponsePipelineStageNoPaging =
            collectionResponsePipelineStageNoPagingFuture.get()
        collectionResponsePipelineStageNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateAllProperties() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineFuture =
            pipelineServiceAsync.updateAllProperties(
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

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateStage() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineStageFuture =
            pipelineServiceAsync.updateStage(
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

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateStageAllProperties() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pipelineServiceAsync = client.crm().pipelines()

        val pipelineStageFuture =
            pipelineServiceAsync.updateStageAllProperties(
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

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }
}
