  $(window).on('keydown', function (event)
            {
                if (event.keyCode == 123)
                {
                    window.location.reload(true);
                    return false;
                } else if (event.ctrlKey && event.shiftKey && event.keyCode == 73)
                {
                    window.location.reload(true);
                    return false;
                } else if (event.ctrlKey && event.shiftKey && event.keyCode == 74)
                {
                    window.location.reload(true);
                    return false;
                } else if (event.ctrlKey && event.shiftKey && event.keyCode == 67)
                {
                    window.location.reload(true);
                    return false;
                } else if (event.ctrlKey && event.keyCode == 85)
                {
                    window.location.reload(true);
                    return false;
                }

            });
            $(document).on("contextmenu", function (e)
            {
                e.preventDefault();
            });