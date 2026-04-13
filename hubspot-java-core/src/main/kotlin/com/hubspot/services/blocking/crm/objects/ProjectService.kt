// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.SimplePublicObject
import com.hubspot.models.crm.objects.PublicMergeInput
import com.hubspot.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.projects.ProjectCreateParams
import com.hubspot.models.crm.objects.projects.ProjectDeleteParams
import com.hubspot.models.crm.objects.projects.ProjectGetParams
import com.hubspot.models.crm.objects.projects.ProjectListPage
import com.hubspot.models.crm.objects.projects.ProjectListParams
import com.hubspot.models.crm.objects.projects.ProjectMergeParams
import com.hubspot.models.crm.objects.projects.ProjectSearchParams
import com.hubspot.models.crm.objects.projects.ProjectUpdateParams
import com.hubspot.services.blocking.crm.objects.projects.BatchService
import java.util.function.Consumer

interface ProjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService

    fun batch(): BatchService

    /**
     * Create a project with the given properties and return a copy of the object, including the ID.
     */
    fun create(params: ProjectCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            ProjectCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{projectId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{projectId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(projectId: String, params: ProjectUpdateParams): SimplePublicObject =
        update(projectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        projectId: String,
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see update */
    fun update(params: ProjectUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of projects. Control what is returned via the `properties` query param. */
    fun list(): ProjectListPage = list(ProjectListParams.none())

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectListPage

    /** @see list */
    fun list(params: ProjectListParams = ProjectListParams.none()): ProjectListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ProjectListPage =
        list(ProjectListParams.none(), requestOptions)

    /** Move an Object identified by `{projectId}` to the recycling bin. */
    fun delete(projectId: String) = delete(projectId, ProjectDeleteParams.none())

    /** @see delete */
    fun delete(
        projectId: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see delete */
    fun delete(projectId: String, params: ProjectDeleteParams = ProjectDeleteParams.none()) =
        delete(projectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ProjectDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(projectId: String, requestOptions: RequestOptions) =
        delete(projectId, ProjectDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{projectId}`. `{projectId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(projectId: String): SimplePublicObjectWithAssociations =
        get(projectId, ProjectGetParams.none())

    /** @see get */
    fun get(
        projectId: String,
        params: ProjectGetParams = ProjectGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see get */
    fun get(
        projectId: String,
        params: ProjectGetParams = ProjectGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(projectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ProjectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: ProjectGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(projectId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(projectId, ProjectGetParams.none(), requestOptions)

    /**
     * Merge two project records. Learn more about
     * [merging records](https://knowledge.hubspot.com/records/merge-records).
     */
    fun merge(params: ProjectMergeParams): SimplePublicObject = merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: ProjectMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see merge */
    fun merge(
        publicMergeInput: PublicMergeInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        merge(
            ProjectMergeParams.builder().publicMergeInput(publicMergeInput).build(),
            requestOptions,
        )

    /** @see merge */
    fun merge(publicMergeInput: PublicMergeInput): SimplePublicObject =
        merge(publicMergeInput, RequestOptions.none())

    /**
     * Search for projects by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(params: ProjectSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ProjectSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            ProjectSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [ProjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/projects`, but is otherwise
         * the same as [ProjectService.create].
         */
        @MustBeClosed
        fun create(params: ProjectCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                ProjectCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/projects/{projectId}`, but is
         * otherwise the same as [ProjectService.update].
         */
        @MustBeClosed
        fun update(
            projectId: String,
            params: ProjectUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(projectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            projectId: String,
            params: ProjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ProjectUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/projects`, but is otherwise the
         * same as [ProjectService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ProjectListPage> = list(ProjectListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): HttpResponseFor<ProjectListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProjectListPage> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/projects/{projectId}`, but
         * is otherwise the same as [ProjectService.delete].
         */
        @MustBeClosed
        fun delete(projectId: String): HttpResponse = delete(projectId, ProjectDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
        ): HttpResponse = delete(projectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ProjectDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(projectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(projectId, ProjectDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/projects/{projectId}`, but is
         * otherwise the same as [ProjectService.get].
         */
        @MustBeClosed
        fun get(projectId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(projectId, ProjectGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            projectId: String,
            params: ProjectGetParams = ProjectGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            projectId: String,
            params: ProjectGetParams = ProjectGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(projectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ProjectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: ProjectGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            projectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(projectId, ProjectGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/projects/merge`, but is
         * otherwise the same as [ProjectService.merge].
         */
        @MustBeClosed
        fun merge(params: ProjectMergeParams): HttpResponseFor<SimplePublicObject> =
            merge(params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            params: ProjectMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see merge */
        @MustBeClosed
        fun merge(
            publicMergeInput: PublicMergeInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            merge(
                ProjectMergeParams.builder().publicMergeInput(publicMergeInput).build(),
                requestOptions,
            )

        /** @see merge */
        @MustBeClosed
        fun merge(publicMergeInput: PublicMergeInput): HttpResponseFor<SimplePublicObject> =
            merge(publicMergeInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/projects/search`, but is
         * otherwise the same as [ProjectService.search].
         */
        @MustBeClosed
        fun search(
            params: ProjectSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: ProjectSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                ProjectSearchParams.builder()
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
