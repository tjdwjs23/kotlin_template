var main = {
    init : function () {
        var _this = this;
        document.getElementById('btn-save').addEventListener('click', function () {
            _this.save();
        });
    },
    save : function () {
        var data = {
            title : document.getElementById('title').value,
            author : document.getElementById('author').value,
            content : document.getElementById('content').value
        };

        fetch('/api/v1/posts', {
            method: 'POST',
            body: JSON.stringify(data),
            headers: {
                'Content-Type': 'application/json; charset=utf-8',
            }
            }).then(function(response) {
            if(response.status == 200) {
                alert('글이 등록되었습니다.');
                window.location.href = '/';
            } else {
                alert('글 등록에 실패했습니다.');
            }
        });
    }
};

main.init();