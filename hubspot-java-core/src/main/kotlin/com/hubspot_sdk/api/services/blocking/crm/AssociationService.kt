// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.LabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.AssociationDeleteAssociationsParams
import com.hubspot_sdk.api.models.crm.associations.AssociationRequestHighUsageReportParams
import com.hubspot_sdk.api.models.crm.associations.AssociationUpdateAssociationLabelsParams
import com.hubspot_sdk.api.models.crm.associations.ReportCreationResponse
import com.hubspot_sdk.api.services.blocking.crm.associations.BatchService
import java.util.function.Consumer

interface AssociationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationService

    fun batch(): BatchService

    fun deleteAssociations(toObjectId: String, params: AssociationDeleteAssociationsParams) =
        deleteAssociations(toObjectId, params, RequestOptions.none())

    /** @see deleteAssociations */
    fun deleteAssociations(
        toObjectId: String,
        params: AssociationDeleteAssociationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteAssociations(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see deleteAssociations */
    fun deleteAssociations(params: AssociationDeleteAssociationsParams) =
        deleteAssociations(params, RequestOptions.none())

    /** @see deleteAssociations */
    fun deleteAssociations(
        params: AssociationDeleteAssociationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Requests a report of all objects in the portal which have a high usage of associations */
    fun requestHighUsageReport(userId: Int): ReportCreationResponse =
        requestHighUsageReport(userId, AssociationRequestHighUsageReportParams.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        params: AssociationRequestHighUsageReportParams =
            AssociationRequestHighUsageReportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCreationResponse =
        requestHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        params: AssociationRequestHighUsageReportParams =
            AssociationRequestHighUsageReportParams.none(),
    ): ReportCreationResponse = requestHighUsageReport(userId, params, RequestOptions.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        params: AssociationRequestHighUsageReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCreationResponse

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        params: AssociationRequestHighUsageReportParams
    ): ReportCreationResponse = requestHighUsageReport(params, RequestOptions.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        requestOptions: RequestOptions,
    ): ReportCreationResponse =
        requestHighUsageReport(
            userId,
            AssociationRequestHighUsageReportParams.none(),
            requestOptions,
        )

    fun updateAssociationLabels(
        toObjectId: String,
        params: AssociationUpdateAssociationLabelsParams,
    ): LabelsBetweenObjectPair = updateAssociationLabels(toObjectId, params, RequestOptions.none())

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        toObjectId: String,
        params: AssociationUpdateAssociationLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LabelsBetweenObjectPair =
        updateAssociationLabels(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        params: AssociationUpdateAssociationLabelsParams
    ): LabelsBetweenObjectPair = updateAssociationLabels(params, RequestOptions.none())

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        params: AssociationUpdateAssociationLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LabelsBetweenObjectPair

    /**
     * A view of [AssociationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /crm/objects/2026-03/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [AssociationService.deleteAssociations].
         */
        @MustBeClosed
        fun deleteAssociations(
            toObjectId: String,
            params: AssociationDeleteAssociationsParams,
        ): HttpResponse = deleteAssociations(toObjectId, params, RequestOptions.none())

        /** @see deleteAssociations */
        @MustBeClosed
        fun deleteAssociations(
            toObjectId: String,
            params: AssociationDeleteAssociationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteAssociations(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see deleteAssociations */
        @MustBeClosed
        fun deleteAssociations(params: AssociationDeleteAssociationsParams): HttpResponse =
            deleteAssociations(params, RequestOptions.none())

        /** @see deleteAssociations */
        @MustBeClosed
        fun deleteAssociations(
            params: AssociationDeleteAssociationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/usage/high-usage-report/{userId}`, but is otherwise the same as
         * [AssociationService.requestHighUsageReport].
         */
        @MustBeClosed
        fun requestHighUsageReport(userId: Int): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(userId, AssociationRequestHighUsageReportParams.none())

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            userId: Int,
            params: AssociationRequestHighUsageReportParams =
                AssociationRequestHighUsageReportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            userId: Int,
            params: AssociationRequestHighUsageReportParams =
                AssociationRequestHighUsageReportParams.none(),
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(userId, params, RequestOptions.none())

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            params: AssociationRequestHighUsageReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCreationResponse>

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            params: AssociationRequestHighUsageReportParams
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(params, RequestOptions.none())

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            userId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(
                userId,
                AssociationRequestHighUsageReportParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /crm/objects/2026-03/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [AssociationService.updateAssociationLabels].
         */
        @MustBeClosed
        fun updateAssociationLabels(
            toObjectId: String,
            params: AssociationUpdateAssociationLabelsParams,
        ): HttpResponseFor<LabelsBetweenObjectPair> =
            updateAssociationLabels(toObjectId, params, RequestOptions.none())

        /** @see updateAssociationLabels */
        @MustBeClosed
        fun updateAssociationLabels(
            toObjectId: String,
            params: AssociationUpdateAssociationLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LabelsBetweenObjectPair> =
            updateAssociationLabels(
                params.toBuilder().toObjectId(toObjectId).build(),
                requestOptions,
            )

        /** @see updateAssociationLabels */
        @MustBeClosed
        fun updateAssociationLabels(
            params: AssociationUpdateAssociationLabelsParams
        ): HttpResponseFor<LabelsBetweenObjectPair> =
            updateAssociationLabels(params, RequestOptions.none())

        /** @see updateAssociationLabels */
        @MustBeClosed
        fun updateAssociationLabels(
            params: AssociationUpdateAssociationLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LabelsBetweenObjectPair>
    }
}
