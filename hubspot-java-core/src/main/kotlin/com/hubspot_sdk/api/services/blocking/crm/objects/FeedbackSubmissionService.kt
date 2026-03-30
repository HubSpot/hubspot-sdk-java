// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.feedbacksubmissions.FeedbackSubmissionGetParams
import com.hubspot_sdk.api.models.crm.objects.feedbacksubmissions.FeedbackSubmissionListPage
import com.hubspot_sdk.api.models.crm.objects.feedbacksubmissions.FeedbackSubmissionListParams
import com.hubspot_sdk.api.models.crm.objects.feedbacksubmissions.FeedbackSubmissionSearchParams
import com.hubspot_sdk.api.services.blocking.crm.objects.feedbacksubmissions.BatchService
import java.util.function.Consumer

interface FeedbackSubmissionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackSubmissionService

    fun batch(): BatchService

    /**
     * Read a page of feedback submissions. Control what is returned via the `properties` query
     * param.
     */
    fun list(): FeedbackSubmissionListPage = list(FeedbackSubmissionListParams.none())

    /** @see list */
    fun list(
        params: FeedbackSubmissionListParams = FeedbackSubmissionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackSubmissionListPage

    /** @see list */
    fun list(
        params: FeedbackSubmissionListParams = FeedbackSubmissionListParams.none()
    ): FeedbackSubmissionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FeedbackSubmissionListPage =
        list(FeedbackSubmissionListParams.none(), requestOptions)

    /**
     * Read an Object identified by `{feedbackSubmissionId}`. `{feedbackSubmissionId}` refers to the
     * internal object ID by default, or optionally any unique property value as specified by the
     * `idProperty` query param. Control what is returned via the `properties` query param.
     */
    fun get(feedbackSubmissionId: String): SimplePublicObjectWithAssociations =
        get(feedbackSubmissionId, FeedbackSubmissionGetParams.none())

    /** @see get */
    fun get(
        feedbackSubmissionId: String,
        params: FeedbackSubmissionGetParams = FeedbackSubmissionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().feedbackSubmissionId(feedbackSubmissionId).build(), requestOptions)

    /** @see get */
    fun get(
        feedbackSubmissionId: String,
        params: FeedbackSubmissionGetParams = FeedbackSubmissionGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(feedbackSubmissionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FeedbackSubmissionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: FeedbackSubmissionGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        feedbackSubmissionId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(feedbackSubmissionId, FeedbackSubmissionGetParams.none(), requestOptions)

    /**
     * Execute a search to retrieve feedback submissions based on defined filters, properties, and
     * sorting options.
     */
    fun search(
        params: FeedbackSubmissionSearchParams
    ): CollectionResponseWithTotalSimplePublicObject = search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: FeedbackSubmissionSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            FeedbackSubmissionSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [FeedbackSubmissionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackSubmissionService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/feedback_submissions`, but is
         * otherwise the same as [FeedbackSubmissionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<FeedbackSubmissionListPage> =
            list(FeedbackSubmissionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FeedbackSubmissionListParams = FeedbackSubmissionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackSubmissionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FeedbackSubmissionListParams = FeedbackSubmissionListParams.none()
        ): HttpResponseFor<FeedbackSubmissionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FeedbackSubmissionListPage> =
            list(FeedbackSubmissionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/feedback_submissions/{feedbackSubmissionId}`, but is otherwise the
         * same as [FeedbackSubmissionService.get].
         */
        @MustBeClosed
        fun get(feedbackSubmissionId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(feedbackSubmissionId, FeedbackSubmissionGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            feedbackSubmissionId: String,
            params: FeedbackSubmissionGetParams = FeedbackSubmissionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(
                params.toBuilder().feedbackSubmissionId(feedbackSubmissionId).build(),
                requestOptions,
            )

        /** @see get */
        @MustBeClosed
        fun get(
            feedbackSubmissionId: String,
            params: FeedbackSubmissionGetParams = FeedbackSubmissionGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(feedbackSubmissionId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FeedbackSubmissionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(
            params: FeedbackSubmissionGetParams
        ): HttpResponseFor<SimplePublicObjectWithAssociations> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            feedbackSubmissionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(feedbackSubmissionId, FeedbackSubmissionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/feedback_submissions/search`,
         * but is otherwise the same as [FeedbackSubmissionService.search].
         */
        @MustBeClosed
        fun search(
            params: FeedbackSubmissionSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: FeedbackSubmissionSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                FeedbackSubmissionSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
