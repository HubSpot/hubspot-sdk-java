// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetCreateParams
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetDeleteParams
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetGetParams
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetListPage
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetListParams
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetSearchParams
import com.hubspot_sdk.api.models.crm.objects.goaltargets.GoalTargetUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.goaltargets.BatchService
import java.util.function.Consumer

interface GoalTargetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GoalTargetService

    fun batch(): BatchService

    /**
     * Create a goal target with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard goal targets is provided.
     */
    fun create(params: GoalTargetCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GoalTargetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            GoalTargetCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{goalTargetId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{goalTargetId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(goalTargetId: String, params: GoalTargetUpdateParams): SimplePublicObject =
        update(goalTargetId, params, RequestOptions.none())

    /** @see update */
    fun update(
        goalTargetId: String,
        params: GoalTargetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

    /** @see update */
    fun update(params: GoalTargetUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GoalTargetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of goal targets. Control what is returned via the `properties` query param. */
    fun list(): GoalTargetListPage = list(GoalTargetListParams.none())

    /** @see list */
    fun list(
        params: GoalTargetListParams = GoalTargetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GoalTargetListPage

    /** @see list */
    fun list(params: GoalTargetListParams = GoalTargetListParams.none()): GoalTargetListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): GoalTargetListPage =
        list(GoalTargetListParams.none(), requestOptions)

    /** Delete a goal target by `{goalTargetId}` to the recycling bin. */
    fun delete(goalTargetId: String) = delete(goalTargetId, GoalTargetDeleteParams.none())

    /** @see delete */
    fun delete(
        goalTargetId: String,
        params: GoalTargetDeleteParams = GoalTargetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

    /** @see delete */
    fun delete(
        goalTargetId: String,
        params: GoalTargetDeleteParams = GoalTargetDeleteParams.none(),
    ) = delete(goalTargetId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GoalTargetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: GoalTargetDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(goalTargetId: String, requestOptions: RequestOptions) =
        delete(goalTargetId, GoalTargetDeleteParams.none(), requestOptions)

    /**
     * Retrieve a goal target by its ID. You can specify what is returned using the `properties`
     * query parameter.
     */
    fun get(goalTargetId: String): SimplePublicObjectWithAssociations =
        get(goalTargetId, GoalTargetGetParams.none())

    /** @see get */
    fun get(
        goalTargetId: String,
        params: GoalTargetGetParams = GoalTargetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

    /** @see get */
    fun get(
        goalTargetId: String,
        params: GoalTargetGetParams = GoalTargetGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(goalTargetId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GoalTargetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: GoalTargetGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        goalTargetId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(goalTargetId, GoalTargetGetParams.none(), requestOptions)

    /** Search for goal targets using specified criteria. */
    fun search(params: GoalTargetSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: GoalTargetSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            GoalTargetSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [GoalTargetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GoalTargetService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/goal_targets`, but is
         * otherwise the same as [GoalTargetService.create].
         */
        @MustBeClosed
        fun create(params: GoalTargetCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GoalTargetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                GoalTargetCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<SimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/goal_targets/{goalTargetId}`,
         * but is otherwise the same as [GoalTargetService.update].
         */
        @MustBeClosed
        fun update(
            goalTargetId: String,
            params: GoalTargetUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(goalTargetId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            goalTargetId: String,
            params: GoalTargetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: GoalTargetUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: GoalTargetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/goal_targets`, but is otherwise
         * the same as [GoalTargetService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<GoalTargetListPage> = list(GoalTargetListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GoalTargetListParams = GoalTargetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GoalTargetListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: GoalTargetListParams = GoalTargetListParams.none()
        ): HttpResponseFor<GoalTargetListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<GoalTargetListPage> =
            list(GoalTargetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/objects/2026-03/goal_targets/{goalTargetId}`, but is otherwise the same as
         * [GoalTargetService.delete].
         */
        @MustBeClosed
        fun delete(goalTargetId: String): HttpResponse =
            delete(goalTargetId, GoalTargetDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            goalTargetId: String,
            params: GoalTargetDeleteParams = GoalTargetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            goalTargetId: String,
            params: GoalTargetDeleteParams = GoalTargetDeleteParams.none(),
        ): HttpResponse = delete(goalTargetId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GoalTargetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: GoalTargetDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(goalTargetId: String, requestOptions: RequestOptions): HttpResponse =
            delete(goalTargetId, GoalTargetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/goal_targets/{goalTargetId}`,
         * but is otherwise the same as [GoalTargetService.get].
         */
        @MustBeClosed
        fun get(goalTargetId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(goalTargetId, GoalTargetGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            goalTargetId: String,
            params: GoalTargetGetParams = GoalTargetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().goalTargetId(goalTargetId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            goalTargetId: String,
            params: GoalTargetGetParams = GoalTargetGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(goalTargetId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: GoalTargetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: GoalTargetGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            goalTargetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(goalTargetId, GoalTargetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/goal_targets/search`, but is
         * otherwise the same as [GoalTargetService.search].
         */
        @MustBeClosed
        fun search(
            params: GoalTargetSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: GoalTargetSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                GoalTargetSearchParams.builder()
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
